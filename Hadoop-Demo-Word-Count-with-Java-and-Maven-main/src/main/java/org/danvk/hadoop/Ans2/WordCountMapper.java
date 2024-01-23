package org.danvk.hadoop.Ans2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper extends
        Mapper<Object, Text, Text, IntWritable> {

    private final IntWritable ONE = new IntWritable(1);

    public static boolean isValidIPAddress(String ipAddress) {
        // Split the IP address into its components
        String[] components = ipAddress.split("\\.");

        // Check if there are exactly 4 components
        if (components.length != 4) {
            return false;
        }

        // Check each component for a valid integer value in the range [0, 255]
        for (String component : components) {
            try {
                int value = Integer.parseInt(component);
                if (value < 0 || value > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false; // Component is not a valid integer
            }
        }

        return true;
    }

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String[] logComponents = value.toString().split(" ");
        Text word = new Text("10.216.113.172");

        if (logComponents.length >= 7) {
            String clientIP = logComponents[0];
            String httpMethod = logComponents[5];  // Index for HTTP method
//            System.out.println(httpMethod);

            if (isValidIPAddress(clientIP) && httpMethod.equals("\"POST") && clientIP.equals(word.toString())) {
                context.write(new Text(clientIP), ONE);
            }
        }
    }
}
