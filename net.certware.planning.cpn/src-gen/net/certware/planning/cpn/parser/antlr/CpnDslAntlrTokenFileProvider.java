/*
* generated by Xtext
*/
package net.certware.planning.cpn.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CpnDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/certware/planning/cpn/parser/antlr/internal/InternalCpnDsl.tokens");
	}
}