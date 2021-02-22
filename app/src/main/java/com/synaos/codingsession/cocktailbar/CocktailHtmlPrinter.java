package com.synaos.codingsession.cocktailbar;

import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
public class CocktailHtmlPrinter implements Printer {

    @Override
    public String print(Collection<Cocktail> cocktails) {
        Object[] cocktailArray = cocktails.toArray();
        StringBuffer output = new StringBuffer();
        output.append("<ul>");
        for (int i = 0; i < cocktailArray.length; i++) {
            Cocktail cocktail = (Cocktail) cocktailArray[i];
            output.append("<li><b>name:&nbsp;</b>" + cocktail.getName() + "&nbsp;&nbsp;<b>description:&nbsp;</b>"
                    + cocktail.getDescription() + " <br></li>");
        }
        output.append("</ul>");
        return output.toString();
    }

}