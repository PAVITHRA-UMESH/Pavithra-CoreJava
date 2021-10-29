package Session;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornCalculate {

	public static void main(String[] args)
			throws ScriptException, NoSuchMethodException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

		Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);
		engine.eval(new FileReader("MyResource/Calci.js"));

		//Taking the two numbers from the User
		System.out.println("ENTER THE TWO NUMBERS : ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		Invocable invocable = (Invocable) engine;
		invocable.invokeFunction("add", num1, num2);
		invocable.invokeFunction("sub", num1, num2);
		invocable.invokeFunction("multi", num1, num2);
		if (num2 == 0)
			invocable.invokeFunction("div", num1, 1); // Default procedure
		else
			invocable.invokeFunction("div", num1, num2);
		invocable.invokeFunction("message");
	}

}
