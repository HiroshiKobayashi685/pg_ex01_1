package task1_counter;

public class Counter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//初期変数を設定
		int i = 1;

		//ループ処理を記載
		while(i <= 100){
			//ループ時に変数aを初期化
			String a;

			if(i%3 ==0 && i%4 ==0){
				a ="◆";
			}
			else if(i%3 ==0 && i%4 !=0){
				a = "△";
			}
			else if(i%3 !=0 && i%4 ==0){
				a = "□";
			}
			else{
				a = String.valueOf(i);
			}

			//変数aを出力
			System.out.print(a+" ");
			i++;
		}
	}

}
