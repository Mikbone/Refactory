package App;

import java.util.Properties;
import java.util.StringTokenizer;
public class StartApp
{
   private static final String THE_D = "-D";

public static void main(String[] args)
   {
      Properties props = new Properties();
      for (int i= 0; i < args.length; i++)
      {
         if(args[i].startsWith(THE_D))
         {
           addProp(props, args[i].substring(2));
         }
      }
      //continue...
   }

private static void addProp(Properties props, String s) {
	StringTokenizer st = new StringTokenizer(s, "=");
	    if(st.countTokens() == 2)
	    {
	      String key = st.nextToken();
	      String valu = st.nextToken();
	      props.setProperty(key, valu);
	    }
}
}