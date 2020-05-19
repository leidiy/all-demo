package com.example.all.demo.mybatis.beanchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 72082934
 */
// 吞吐量
@BenchmarkMode(Mode.Throughput)
// 结果所使用的时间单位
@OutputTimeUnit(TimeUnit.MILLISECONDS)
// 每个测试线程分配一个实例
@State(Scope.Thread)
// Fork进行的数目
@Fork(2)
// 先预热4轮
@Warmup(iterations = 4)
// 进行10轮测试
@Measurement(iterations = 10)
public class BenchMark {


    /**
     * 定义四个参数，之后会分别对这四个参数进行测试
     */
    @Param({"10", "40", "70", "100"})
    private int n;

    private List<Integer> array;
    private List<Integer> list;

    /**
     * 初始化方法，在全部Benchmark运行之前进行
     */
    @Setup(Level.Trial)
    public void init() {
        array = new ArrayList<>(0);
        list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            array.add(i);
            list.add(i);
        }
    }

    @Benchmark
    public void arrayTraverse() {
        for (int i = 0; i < n; i++) {
            array.get(i);
        }
    }

    @Benchmark
    public void listTraverse() {
        for (int i = 0; i < n; i++) {
            list.get(i);
        }
    }

    /**
     * 结束方法，在全部Benchmark运行之后进行
     */
    @TearDown(Level.Trial)
    public void arrayRemove() {
        for (int i = 0; i < n; i++) {
            array.remove(0);
            list.remove(0);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(BenchMark.class.getSimpleName()).build();
        new Runner(options).run();
    }
}