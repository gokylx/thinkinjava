// Registering Class Factories in the base class
package typeinfo;

import java.util.ArrayList;
import java.util.List;

import typeinfo.factory.Factory;

class Part {
	@Override
	public String toString() {
		return getClass().getName();
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<>();
	static {
	}
}

public class RegisteredFactories {

}
