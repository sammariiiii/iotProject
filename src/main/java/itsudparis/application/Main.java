/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package itsudparis.application;

import java.io.FileReader;
import java.io.IOException;

import com.hp.hpl.jena.rdf.model.Model;
import com.opencsv.CSVReader;

import itsudparis.tools.JenaEngine;

/**
 *
 * @author DO.ITSUDPARIS
 */
public class Main {
  
    /**
     * @param args rhe command line arguments
     * @throws IOException
     */
   

public static void main(String[] args) throws IOException {
	String NS = "";
	// lire le model a partir d'une ontologie
	Model model = JenaEngine.readModel("data/iottp.owl");
	if (model != null) {
	//lire le Namespace de l’ontologie
	NS = model.getNsPrefixURI("");
	String file ="data/beach.csv"; 
	CSVReader csvReader = new CSVReader(new FileReader(file));
	String[] csvrow = null;
	csvrow=csvReader.readNext();
	System.out.println(csvrow);
	// modifier le model
	// // Ajouter une nouvelle femme dans le modele: Nora,50, estFilleDe Peter
	// JenaEngine.createInstanceOfClass(model, NS, "Femme","Nora");
	// //JenaEngine.createInstanceOfClass(model, NS, "Personne","Nora");
	// JenaEngine.updateValueOfDataTypeProperty(model, NS,"Nora", "age", 50);
	// JenaEngine.updateValueOfObjectProperty(model, NS,"Nora", "estFilleDe", "Peter");
	// // Ajouter un nouvel homme dans le modele: Rob, 51,seMarierAvec Nora
	// JenaEngine.createInstanceOfClass(model, NS, "Homme","Rob");
	// JenaEngine.updateValueOfDataTypeProperty(model, NS,"Rob", "age", 51);
	// JenaEngine.updateValueOfDataTypeProperty(model, NS,"Rob", "nom", "Rob Yeung");
	// JenaEngine.updateValueOfObjectProperty(model, NS,"Rob", "seMarierAvec", "Nora");
	// //apply owl rules on the model
	// Model owlInferencedModel =
	// JenaEngine.readInferencedModelFromRuleFile(model, "data/owlrules.txt");
	// // apply our rules on the owlInferencedModel
	// Model inferedModel =
	// JenaEngine.readInferencedModelFromRuleFile(owlInferencedModel,"data/rules.txt");
	// query on the model after inference
	System.out.println("on est dans le if");
	} else {
	System.out.println("Error when reading model from ontology");
	}
	 
}
}

