package test.jmeter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class MyTestJmeter extends AbstractJavaSamplerClient {
	//private SampleResult results;
	private String a;
	private String b;
	private String filename;
	
	public Arguments getDefaultParameters(){
		Arguments params = new Arguments();
		params.addArgument("filename","1.txt");
		params.addArgument("a","0");
		params.addArgument("b","0");
		return params;
	}
	

	@Override
	public SampleResult runTest(JavaSamplerContext arg0) {
		
		// TODO Auto-generated method stub
		SampleResult results = new SampleResult();
		a = arg0.getParameter("a");
		b = arg0.getParameter("b");
		filename = arg0.getParameter("filename");
		results.sampleStart();
		try {
			printFile(filename,a,b);
			results.setSuccessful(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			results.setSuccessful(false);
			e.printStackTrace();
		}finally{
			results.sampleEnd();
		}
		return results;
	}
	
	public void setupTest(JavaSamplerContext context) {
        //getNewLogger().info("≤‚ ‘÷¥––÷Æ«∞...");
        super.setupTest(context);
    }


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Arguments params = new Arguments();
		params.addArgument("filename","a.txt");
		params.addArgument("a","elephant");
		params.addArgument("b","Monkey");
		JavaSamplerContext arg0 = new JavaSamplerContext(params);
		MyTestJmeter mtj = new MyTestJmeter();
	    //mtj.printFile("c.txt","Tiger","Lion");
	    //mtj.setupTest(arg0);
	    mtj.runTest(arg0);
	    //mtj.teardownTest(arg0);
	    

	}
	
	
	public void printFile(String filename,String a,String b) throws IOException{
		FileWriter fileWriter = null;
		fileWriter = new FileWriter("D:/"+filename);
		fileWriter.write(a+"\r\n");
		fileWriter.write(b+"\r\n");
		fileWriter.flush();
		fileWriter.close();
	}
		
}
