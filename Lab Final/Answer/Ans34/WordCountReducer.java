package org.danvk.hadoop.Ans34;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    private Text mostPopularFile = new Text("");
    private int maxHits = Integer.MIN_VALUE;

    public void reduce(Text key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {

        int sum = 0;
        for (IntWritable value : values) {
            sum += value.get();
        }

        // Update most popular file if current sum is greater
        if (sum > maxHits) {
            maxHits = sum;
            mostPopularFile.set(key);
        }
    }

    @Override
    protected void cleanup(Context context) throws IOException, InterruptedException {
        // Output the most popular file and its hit count
        context.write(mostPopularFile, new IntWritable(maxHits));
    }
}
