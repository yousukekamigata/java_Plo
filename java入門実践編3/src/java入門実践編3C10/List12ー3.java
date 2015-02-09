//STEP2-2-1 送信すべきSQL文のひな形を準備
PreparedStatement pstmt=con.prepareStatement
("SELECT*FROM MONSTER WHERE HP>=?");
//STEP2-2-2ひな形に値を流し込みSQL文を組み立てて送信する
pstmt.setInt(1,10);
ResultSet rs=pstmt.executeQuery();
//STEP2-2-3結果表を処理する
if(rs.next()){
	System.out.println(rs.getString("NAME"));
}


rs.close();
pstmt.close();
