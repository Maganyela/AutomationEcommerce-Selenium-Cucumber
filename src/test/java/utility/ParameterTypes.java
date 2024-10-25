package utility;

import io.cucumber.java.ParameterType;
public class ParameterTypes {

        @ParameterType(".*")
        public String stringParameter(String value) {
            return value;
        }

}
