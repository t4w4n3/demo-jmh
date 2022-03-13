package gradle;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExtractLabelsBenchmark {

	@Fork(1)
	@OutputTimeUnit(TimeUnit.NANOSECONDS)
	@BenchmarkMode(Mode.AverageTime)
	@Warmup(iterations = 3)
	@Benchmark
	public List<String> withForLoop(MyState myState) {
		return myState.appWithForLoop.run();
	}

	@Fork(1)
	@OutputTimeUnit(TimeUnit.NANOSECONDS)
	@BenchmarkMode(Mode.AverageTime)
	@Warmup(iterations = 3)
	@Benchmark
	public List<String> withStream(MyState myState) {
		return myState.appWithStream.run();
	}
}