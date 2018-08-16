package de.oster.generic.search.parser;

import de.oster.generic.StaticConfiguration;
import de.oster.generic.search.StatementPart;
import de.oster.generic.search.method.Method;
import de.oster.generic.search.parser.exception.SyntaxException;
import de.oster.generic.search.parser.exception.UnknownMethodException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StatementParser {

    /**
     *
     * Parser has the following tasks:
     *  -Check the syntax
     *  -Throw detailed syntax errors
     *  -Parse the statement string to a flat order(Means no parents left within the statement)
     *  -Convert the parsed statement string to {@link ArrayList<StatementPart>}
     *
     * @param statement
     * @return Chain of {@link StatementPart} in the following order:
     * 1. {@link Method}
     * 2. {@link de.oster.generic.search.method.concate.Concate}
     * 3. {@link Method}
     * 4. ...
     * Always ends with a {@link Method} object.
     */
    public ArrayList<StatementPart> parse(String statement)
    {
        if(statement == null || statement.isEmpty())
            return new ArrayList<>();

        //TODO PARSE THE GIVEN STATEMENT TREE


        return new ArrayList<>();
    }

    public void parseSingleStatement(String singleStatement)
    {
        //field name
        String fieldName = findFieldName(singleStatement);
        if(fieldName == null)
            throw new SyntaxException("Name of the field not found. Statement: " + singleStatement);

        //method
        Method method = findMethod(singleStatement);
        if(method == null)
            throw new UnknownMethodException("Unknown method. Statement: " + singleStatement);

        List<String> params = findParams(singleStatement);
        if(params == null)
            throw new SyntaxException("Check your given parameters. Statement: " + singleStatement);

        System.out.println("Your method -> " + method.getName() + " for the field -> " + fieldName);

        for (int i = 0; i < params.size(); i++) {
            System.out.println("Parameter" + i + "->" + params.get(i));
        }
    }

    public String findFieldName(String singleStatement)
    {
        String fieldName = null;
        Matcher fieldMatcher = Pattern.compile("^(.*?)[.]").matcher(singleStatement);
        if(fieldMatcher.find())
            fieldName = fieldMatcher.group(1);

        return fieldName;
    }

    public Method findMethod(String singleStatement)
    {
        Method choosenMethod = null;
        for(Method method : StaticConfiguration.methods)
        {
                if(Pattern.compile(".?[.]"+method.getName()+"[(]?", Pattern.CASE_INSENSITIVE).matcher(singleStatement).find())
                    choosenMethod = method;
        }

        return choosenMethod;
    }

    public List<String> findParams(String singleStatement)
    {
        //method params
        Matcher matcher = Pattern.compile("[(](.*?)[)]$").matcher(singleStatement);
        if(!matcher.find())
            return null;

        String params = matcher.group(0);
        //remove whitespace before and after ,
        params = params.replaceAll("\\s*,\\s*", ",");

        //remove (...)
        params = params.replace("(", "").replace(")", "");
        String[] result = params.split(",");

        return Arrays.asList(result);
    }

}
