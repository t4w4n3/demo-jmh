/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fr.tawane.myapp.app;

import java.util.List;

public class App {

	private final ExtractLabels extractLabels;

	public App(ExtractLabels extractLabels) {
		this.extractLabels = extractLabels;
	}

	public static void main(String[] args) {
		var app = new App(new ExtractLabelsWithForLoop());
		app.run();
	}

	public List<String> run() {
		var statuts = List.of(new Statut("sent", "s"), new Statut("received", "r"));
		return extractLabels.extract(statuts);
	}
}
