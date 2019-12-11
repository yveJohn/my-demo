package my.demo.utils;

import org.apache.skywalking.apm.toolkit.trace.ActiveSpan;

public class Tracer {
	public static void trace(String name, Object value) {
		if(value==null) ActiveSpan.tag(name, "null");
		else ActiveSpan.tag(name, value.toString());
	}
}