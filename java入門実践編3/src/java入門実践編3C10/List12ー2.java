//STEP2－1－1送信すべきSQL文のひな形を準備
Preparedstatement pstmt=con.preparestatement
("DELETE FROM MONSTERS WHERE HP<=?OR NAME=?");
//STEP2-1-2ひな形に値を流し込みSQL文を組み立てて送信する
pstmt.setInt(1,10);
pstmt.setString(2,"ゾンビ");
int r=pstmt.executeUpdate();
//STEP2-1-3結果表を処理する
if(r !=0){
System.out.println(r+"件のモンスターを削除しました。")；
}else{
System.out.println("該当するモンスターはいませんでした");
}
pstmt.close();