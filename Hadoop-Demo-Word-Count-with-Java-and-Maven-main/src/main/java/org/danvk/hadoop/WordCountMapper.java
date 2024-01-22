package org.danvk.hadoop;
 
import java.io.IOException;
 
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
 
public class WordCountMapper extends
        Mapper<Object, Text, Text, IntWritable> {
 
    private final IntWritable ONE = new IntWritable(1);
    private Text word = new Text("This"); // Set the word to "test"
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String[] words = value.toString().split("\\s+"); // Split by whitespace
        for (String str : words) {
            if (str.equals(word.toString())) {
                context.write(word, ONE);
            }
        }
    }
}
