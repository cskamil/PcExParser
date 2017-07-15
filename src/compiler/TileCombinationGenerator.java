package compiler;

import entity.AlternativeProgram;
import entity.Compilable;
import entity.Program;
import entity.Tile;
import org.apache.commons.collections4.iterators.PermutationIterator;
import org.apache.commons.math3.util.Combinations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class TileCombinationGenerator {

    public static void createAlternatives(Program program) {
        if(program.getBlankLineList().isEmpty() == false) {
            Set<Tile> blankLinesWithDistractors = new HashSet<>();
            blankLinesWithDistractors.addAll(program.getBlankLineList());
            blankLinesWithDistractors.addAll(program.getDistractorList());

            List<Tile> currentProgramTileList = program.getBlankLineList();

            List<Tile> blankLinesList = new ArrayList<>(blankLinesWithDistractors);
            Iterator<int[]> iterator = new Combinations(blankLinesList.size(), currentProgramTileList.size()).iterator();

            while(iterator.hasNext()) {
                int[] nextCombination = iterator.next();
                List<Tile> tileListFromCombination = createTileListFromCombination(blankLinesList, nextCombination);

                PermutationIterator<Tile> integerPermutationIterator = new PermutationIterator<>(tileListFromCombination);
                while(integerPermutationIterator.hasNext()) {
                    List<Tile> permutatedTileList = integerPermutationIterator.next();
                    AlternativeProgram alternativeProgram = program.addAlternative(permutatedTileList);
                    printAlternativeToFile(nextCombination, alternativeProgram);
                }
            }
        }
    }

    private static void printAlternativeToFile(int[] nextCombination, Compilable program) {
        try {
            Path path = getAlternativeFilePath(nextCombination, program);
            Files.createDirectories(path.getParent());
            Files.write(path, program.getSourceCode().getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Path getAlternativeFilePath(int[] nextCombination, Compilable program) {
       return Paths.get("output/alternatives/" + program.getLanguage().name() + "/"
                                + program.getActivityName() + "/" + program.getFileName() + "/"
                                + program.getFileName() + "_" + Arrays.toString(nextCombination) + "." + program.getLanguage().getExtension());
    }


    private static List<Tile> createTileListFromCombination(List<Tile> blankLinesWithDistractors, int[] nextCombination) {
        List<Tile> tileList = new ArrayList<>();

        for(int index:nextCombination) {
            tileList.add(blankLinesWithDistractors.get(index));
        }

        return tileList;
    }


}
