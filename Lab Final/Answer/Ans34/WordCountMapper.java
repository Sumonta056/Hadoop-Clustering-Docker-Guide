package org.danvk.hadoop.Ans34;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper extends Mapper<Object, Text, Text, IntWritable> {

    private final IntWritable ONE = new IntWritable(1);

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String[] logComponents = value.toString().split(" ");

        if (logComponents.length >= 7) {

            String filePath = logComponents[6];


            context.write(new Text(filePath), ONE);

        }
    }
}
