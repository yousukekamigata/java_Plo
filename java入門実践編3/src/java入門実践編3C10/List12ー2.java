//STEP2�|1�|1���M���ׂ�SQL���̂ЂȌ`������
Preparedstatement pstmt=con.preparestatement
("DELETE FROM MONSTERS WHERE HP<=?OR NAME=?");
//STEP2-1-2�ЂȌ`�ɒl�𗬂�����SQL����g�ݗ��Ăđ��M����
pstmt.setInt(1,10);
pstmt.setString(2,"�]���r");
int r=pstmt.executeUpdate();
//STEP2-1-3���ʕ\����������
if(r !=0){
System.out.println(r+"���̃����X�^�[���폜���܂����B")�G
}else{
System.out.println("�Y�����郂���X�^�[�͂��܂���ł���");
}
pstmt.close();