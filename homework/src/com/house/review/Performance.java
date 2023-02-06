package com.house.review;

public class Performance extends Culture {
	String gne;

	public Performance(String title,int vi, int actors,String gne) {
		super(title,vi,actors);
		this.gne=gne;
	}


	@Override
	public String getGrade() {
		if((double)totalscore/cust/2<=1) {
			result = "☆";
		}else if(((double)totalscore/cust)/2<=2) {
			result = "☆☆";
		}else if(((double)totalscore/cust)/2<=3) {
			result = "☆☆☆";
			}else if(((double)totalscore/cust)/2<=4) {
				result = "☆☆☆☆";
			}else if(((double)totalscore/cust)/2<=5) {
				result = "☆☆☆☆☆";}
		return result;
	}

	@Override
	public void getInformation() {
		System.out.println("공연제목 : "+title+"\n 감독 : "+vi+"\n 배우 : "+actors+"\n 공연총점 : "+totalscore+"\n 공연평점 : "+this.getGrade());
		
	}
/*3) Performance 클래스를 정의한다.
	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
 */
	
	
}
