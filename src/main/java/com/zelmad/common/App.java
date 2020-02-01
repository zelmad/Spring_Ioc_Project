package com.zelmad.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Pour récupèrer pointer sur les beans du fichier 'fichierPourDefinirLesBeans.xml'
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "fichierPourDefinirLesBeans.xml");
        //Pour récupérer précisément l'objet du bean 'FirstBean'.
        HelloWorld obj = (HelloWorld) context.getBean("FirstBean");
        obj.afficherName();

        // nous allons pas discuter le front pour le moment (le résultat sera affiché sur la console).
    }
}