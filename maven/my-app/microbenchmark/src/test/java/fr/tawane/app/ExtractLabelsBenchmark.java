package fr.tawane.app;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

import static java.util.concurrent.TimeUnit.MICROSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;

public class ExtractLabelsBenchmark {

	@Fork(value = 1)
	@BenchmarkMode(AverageTime)
	@Warmup(iterations = 1, time = 2)
	@Measurement(time = 3)
	@OutputTimeUnit(MICROSECONDS)
	@Benchmark
	public void withForLoop(MyState myState) {
		myState.appWithForLoop.run();
	}

	@Fork(value = 1)
	@BenchmarkMode(AverageTime)
	@Warmup(iterations = 1, time = 2)
	@Measurement(time = 3)
	@OutputTimeUnit(MICROSECONDS)
	@Benchmark
	public void withStream(MyState myState) {
		myState.appWithStream.run();
	}
}
