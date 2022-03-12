package gradle;

import org.openjdk.jmh.annotations.State;

import static org.openjdk.jmh.annotations.Scope.Benchmark;

@State(Benchmark)
public class MyState {

	public App appWithForLoop = new App(new ExtractLabelsWithForLoop());
	public App appWithStream = new App(new ExtractLabelsWithStream());
}
