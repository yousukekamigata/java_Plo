//STEP2-2-1 ���M���ׂ�SQL���̂ЂȌ`������
PreparedStatement pstmt=con.prepareStatement
("SELECT*FROM MONSTER WHERE HP>=?");
//STEP2-2-2�ЂȌ`�ɒl�𗬂�����SQL����g�ݗ��Ăđ��M����
pstmt.setInt(1,10);
ResultSet rs=pstmt.executeQuery();
//STEP2-2-3���ʕ\����������
if(rs.next()){
	System.out.println(rs.getString("NAME"));
}


rs.close();
pstmt.close();
