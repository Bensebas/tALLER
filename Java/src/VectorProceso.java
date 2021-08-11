import java.util.Arrays;

public class VectorProceso {
	public static void sort(int X[], int izq, int der) {
		if (izq < der) {
			int mid = (izq + der) / 2;
			sort(X, izq, mid);
			sort(X, mid + 1, der);
			merge(X, izq, mid, der);
		}
	}

	public static void merge(int X[], int izq, int mid, int der) {
		int n1 = mid - izq + 1;
		int n2 = der - mid;
		int izqX[] = new int[n1];
		int derX[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			izqX[i] = X[izq + i];
		}
		for (int j = 0; j < n2; j++) {
			derX[j] = X[mid + j + 1];
		}
		int i = 0;
		int j = 0;
		int k = izq;
		while (i < n1 && j < n2) {
			if (izqX[i] <= derX[j]) {
				X[k] = izqX[i];
				i++;
			} else {
				X[k] = derX[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			X[k] = izqX[i];
			i++;
			k++;
		}
		while (j < n2) {
			X[k] = derX[j];
			j++;
			k++;
		}
	}
	
	
	public static void printX(int X[]) {
		int n = X.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(X[i] + " | ");
			Arrays.sort(X);
		}
	}
}
