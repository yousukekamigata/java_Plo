package java入門実践編3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main85 {

	public static void main(String[] args) {
		Log logger=LogFactory.getLog(Main85.class);
		if(args.length !=2){
			logger.error("起動引数の数が異常:"+args.length);
		}

	}

}
