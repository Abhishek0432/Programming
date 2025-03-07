package classsassignment;

public class Commonthreearry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int myArray1[] = {23, 36, 96, 78, 55};
	        int myArray2[] = {78, 45, 19, 73, 55};
	        int myArray3[] = {34, 78, 21, 35, 55, 88};

	        System.out.println("Intersection of the three arrays:");

	        for (int i = 0; i < myArray1.length; i++) {
	            for (int j = 0; j < myArray2.length; j++) {
	                if (myArray1[i] == myArray2[j]) {
	                    for (int k = 0; k < myArray3.length; k++) {
	                        if (myArray1[i] == myArray3[k]) {
	                            System.out.println(myArray1[i]);
	                            break;
	                        }
	                    }
	                    break; 
	                }
	            }
	        }
		}
	}
