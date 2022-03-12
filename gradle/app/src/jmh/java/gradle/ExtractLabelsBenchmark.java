package gradle;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

import static org.openjdk.jmh.annotations.Mode.AverageTime;

public class ExtractLabelsBenchmark {

	@Fork(value = 1)
	@BenchmarkMode(AverageTime)
	@Warmup(iterations = 2)
	@Measurement(iterations = 2, time = 2)
	@OutputTimeUnit(TimeUnit.MICROSECONDS)
	@Benchmark
	public void helloWorld() {
		var sum = 458 + 692;
	}
}
