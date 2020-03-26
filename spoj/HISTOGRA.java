import java.util.*;
import java.io.*;

//unsolved

class HISTOGRA {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                if (N == 0)
                    break;
                int max_area = 0;
                int cur_area = 0;
                int arr[] = new int[N + 1];
                Stack<Integer> stack = new Stack<Integer>();

                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                arr[N] = 0;

                int i = 0;
                for (i = 0; i <= N; i++) {
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else if (arr[i] >= arr[stack.peek()]) {
                        stack.push(i);
                        i++;
                    }
                    if (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                        while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                            int index = stack.pop();
                            if (stack.isEmpty()) {
                                cur_area = arr[index] * i;
                                max_area = cur_area > max_area ? cur_area : max_area;
                            } else {
                                cur_area = arr[index] * (i - stack.peek() - 1);
                                max_area = cur_area > max_area ? cur_area : max_area;
                            }
                        }
                        stack.push(i);
                    }
                }
                sb.append(max_area + "\n");

            }
            System.out.print(sb);
        } catch (Exception e) {

        }
    }

}
