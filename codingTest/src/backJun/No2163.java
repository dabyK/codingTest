package backJun;

import java.util.Scanner;

public class No2163 {
	public static void main(String[] args) {
		
//		<庚薦>
//		舛鉢澗 N／M 滴奄税 段紬鹸聖 馬蟹 亜走壱 赤陥. 
//		段紬鹸精 榎戚 亜 赤澗 乞丞聖 馬壱 赤生悟, 益 榎拭 税背 N／M鯵税 繕唖生稽 蟹寛霜 呪 赤陥.
//		段紬鹸税 滴奄亜 格巷 滴陥壱 持唖廃 益橿澗 段紬鹸聖 庁姥級引 蟹寛 股奄稽 梅陥. 戚研 是背辞 舛鉢澗 段紬鹸聖 域紗 舵鯵辞 恥 N／M鯵税 繕唖生稽 舵鯵形壱 廃陥. 
//		段紬鹸聖 舵斡 凶拭澗 段紬鹸 繕唖聖 馬蟹 級壱, 旋雁廃 是帖拭辞 段紬鹸聖 舵圧陥. 段紬鹸聖 舵斡 凶拭澗 榎戚 亜 赤澗 是帖拭辞幻 舵斡 呪 赤陥. 
//		戚人 旭戚 段紬鹸聖 舵鯵檎 段紬鹸精 砧 鯵税 繕唖生稽 蟹寛走惟 吉陥. 戚薦 陥獣 戚 掻拭辞 段紬鹸 繕唖聖 馬蟹 級壱, 舵鯵澗 引舛聖 鋼差馬檎 吉陥.
//		段紬鹸聖 舵鯵陥左檎 段紬鹸戚 褐聖 呪 赤奄 凶庚拭, 舛鉢澗 亜厭旋戚檎 段紬鹸聖 舵鯵澗 判呪研 置社稽 馬形 廃陥. 
//		段紬鹸税 滴奄亜 爽嬢然聖 凶, 戚研 1／1 滴奄税 段紬鹸生稽 舵鯵奄 是廃 置社 舵鯵奄 判呪研 姥馬澗 覗稽益轡聖 拙失馬獣神.
		
		
		//胡煽 N引 M掻 笛呪幻鏑 舵扱 3*4 虞檎 4腰 けけけ けけけ けけけ けけけ 3+ (2+2+2+2) 12 
		// けけけけ けけけけ けけけけ 2+ (3+3+3) N-1 + (M-1)*N = N-1+NM-N =NM-1
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		System.out.println(N*M-1);
		
 	}
}
