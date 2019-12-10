package com.foodForRescue.spring.util;

import java.util.regex.Pattern;

import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;

public class SecurityUtil {

	private static PolicyFactory policy = new HtmlPolicyBuilder().disallowAttributes("href").onElements("a")
			.toFactory();

	private static Pattern[] patterns = new Pattern[] {
			/*
			 * This signature first looks out for the = sign or its hex equivalent (%3D). It
			 * then allows for zero or more non-newline characters, and then it checks for
			 * the single-quote, the double-dash or the semi-colon. Detect either the hex
			 * equivalent of the single-quote, the single-quote itself or the presence of
			 * the double-dash. These are SQL characters for MS SQL Server and Oracle, which
			 * denote the beginning of a comment, and everything that follows is ignored.
			 * See more info at
			 * http://www.symantec.com/connect/articles/detection-sql-injection-and-cross-
			 * site-scripting-attacks Regex for detecting SQL Injection meta-characters
			 */
			Pattern.compile("/((\\%3D)|(=))[^\\n]*((\\%27)|(\')|(\\-\\-)|(\\%3B)|(;))/i"),
			/*
			 * Regex for detecting SQL Injection with the UNION keyword
			 *
			 * (\%27)|(\') - the single-quote and its hex equivalent union - the keyword
			 * union
			 */
			Pattern.compile("/((\\%27)|(\'))union/ix"),
			/*
			 * A typical SQL injection attempt of course revolves around the use of the
			 * single quote to manipulate the original query so that it always results in a
			 * true value. Most of the examples that discuss this attack use the string
			 * 1'or'1'='1. However, detection of this string can be easily evaded by
			 * supplying a value such as 1'or2>1--. Thus the only part that is constant in
			 * this is the initial alphanumeric value, followed by a single-quote, and then
			 * followed by the word 'or'. The Boolean logic that comes after this may be
			 * varied to an extent where a generic pattern is either very complex or does
			 * not cover all the variants. Thus these attacks can be detected to a fair
			 * degree of accuracy by using the next regular expression
			 *
			 * Regex for typical SQL Injection attack
			 * 
			 * /\w*((\%27)|(\'))((\%6F)|o|(\%4F))((\%72)|r|(\%52))/ix
			 */
			Pattern.compile("/\\w*((\\%27)|(\\'))((\\%6F)|o|(\\%4F))((\\%72)|r|(\\%52))/ix"),
			// checking for the keywords and a combination of quotes with conjunctions and
			// quotes with double pipe (||)
			Pattern.compile("insert|update|delete|having|drop|(\'|%27).(and|or).(\'|%27)|(\'|%27).%7C{0,2}|%7C{2}") };

//Elimina codigo html en caso de que haya(con OWASP HTML sanitizer), ataque XSS 
	public static String sanitizar(String parametro) {
		return policy.sanitize(parametro);
	}

//Comprobamos si hay codigo Sql (Expresiones regulares patterns), ataque SQLinjection
	public static boolean validateSql(String parametro) {
		boolean valorSql = false;
		for (Pattern pattern : patterns) {
			valorSql = pattern.matcher(parametro).find();
		}
		return valorSql;
	}

}
