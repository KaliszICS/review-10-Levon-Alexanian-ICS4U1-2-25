public class PracticeProblem {

	public static String pyramid(int rows) {
        String pyramid = "";
        for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < rows - i; j++) {
                pyramid += " ";
            }
            for (int j = 0; j < i; j++) {
                pyramid += "*";
                if (j < i - 1) {
                    pyramid += " ";
                }
            }
			if (i != rows) {
				pyramid = pyramid + "\n";
			}
		}
        return pyramid;
    }

	public static String square(int size) {
		String square = "";
		for (int i = 0; i < size; i++) {
            for (int n = 0; n < size; n++) {
				if (i == 0 || i == size - 1 || n == 0 || n == size-1) {
                	square += "*";
            	} else {
					square += " ";
				}

			}
			square += "\n";
        }
        return square.strip();
    }
	public static boolean hasLowercase(String word) {
        if (word == word.toUpperCase()) {
            return false;
        }
        return true;
}
	
}

