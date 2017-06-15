package parser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PcExParser_isLineParsable_Test {
	
	@Test
	public void whenStringLineIsJavadocCommentLineButDoesNotHasCharAt_then_false() {
		String line = "* not parsable";
		assertFalse(PcExParser.isLineParsableComment(line));
	}
	
	@Test
	public void whenStringLineIsJavadocCommentLineAndHasCharAt_then_true() {
		String line = "* @ parsable";
		assertTrue(PcExParser.isLineParsableComment(line));
	}
	
	@Test
	public void whenStringLineIsRegularCommentLine_then_true() {
		String line = "//";
		assertTrue(PcExParser.isLineParsableComment(line));
	}
	
	@Test
	public void whenStringLineIsPackageDeclaration_then_false() {
		String line = "package test_examples;";
		assertFalse(PcExParser.isLineParsableCode(line));
	}
	
	@Test
	public void whenStringLineIsAnAssignment_then_true() {
		String line = "int[] list = new int[5];";
		assertTrue(PcExParser.isLineParsableCode(line));
	}
	
	@Test
	public void whenStringLineIsEmpty_then_false() {
		String line = "";
		assertFalse(PcExParser.isLineParsableCode(line));
	}
	
	@Test
	public void whenStringLineHasCharAT_then_true() {
		String line = "* @helpDescription(A list";
		assertTrue(PcExParser.isLineParsable(line));
	}

}
