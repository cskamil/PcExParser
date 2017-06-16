package parser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import parser.json.entity.Program;

import java.nio.file.Path;

public class AbstractLanguageParser_isLineParsable_Test {

	private JavaParser parser;

	@Before
	public void initialize() {
		parser = new JavaParser(null);
	}
	
	@Test
	public void whenStringLineIsJavadocCommentLineButDoesNotHasCharAt_then_false() {
		String line = "* not parsable";
		assertFalse(parser.isLineComment(line));
	}

	//Move it to abstract test
//	@Test
//	public void whenStringLineIsJavadocCommentLineAndHasCharAt_then_true() {
//		String line = "* @ parsable";
//		assertTrue(parser.isLineComment(line));
//	}

	@Test
	public void whenStringLineIsRegularCommentLine_then_true() {
		String line = "//";
		assertTrue(parser.isLineComment(line));
	}
	
	@Test
	public void whenStringLineIsPackageDeclaration_then_false() {
		String line = "package test_examples;";
		assertFalse(parser.isLineCode(line));
	}
	
	@Test
	public void whenStringLineIsAnAssignment_then_true() {
		String line = "int[] list = new int[5];";
		assertTrue(parser.isLineCode(line));
	}
	
	@Test
	public void whenStringLineIsEmpty_then_false() {
		String line = "";
		assertFalse(parser.isLineCode(line));
	}
	
	@Test
	public void whenStringLineHasCharAT_then_true() {
		String line = "* @helpDescription(A list";
		assertTrue(parser.isLineParsable(line));
	}
}
