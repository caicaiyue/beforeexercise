package test.jmeter;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class NewTestJmeter extends AbstractJavaSamplerClient {
	private String filename;
	private String a;
	
	public Arguments getDefaultParameters(){
		Arguments parameters = new Arguments();
		parameters.addArgument("filename","first");
		parameters.addArgument("a","Fighting");
		return parameters;
	}
	
	
	@Override
	public SampleResult runTest(JavaSamplerContext arg0) {
		// TODO Auto-generated method stub
		SampleResult result = new SampleResult();
		filename = arg0.getParameter("filename");
		a = arg0.getParameter("a");
		//result.sampleStart();
		try {
			printFile(filename,a);
			result.setSuccessful(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			result.setSuccessful(false);
			e.printStackTrace();
		}finally{
			//result.sampleEnd();
		}
		return result;
	}
	
	public void printFile(String filename,String a) throws IOException{
		FileWriter fileWriter = new FileWriter("D:/"+filename+".txt");
		fileWriter.write(a+"\r\n");
		fileWriter.flush();
		fileWriter.close();
	}
	
	public static void main(String[] args) throws IOException{

	}

}
