package compiler;

import entity.Compilable;
import entity.Program;

/**
 * Created by cskamil on 19-Jun-17.
 */
public interface Compiler {
    Response run(Compilable program) throws Exception;
}
