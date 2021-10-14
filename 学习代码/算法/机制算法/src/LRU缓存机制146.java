import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{09}--11:46
 */
public class LRU缓存机制146 {
    public static void main(String[] args) {
        String s = "{\"method\":\"pushSaveMaterialQualification\",\"interface\":\"nc.pubitf.pu.m23.yc.IYCPuArriveService\",\"serviceMethodArgInfo\":[{\"agg\":\"false\",\"argType\":\"java.lang.String\",\"isArray\":\"false\",\"isPrimitive\":\"false\",\"argValue\":\"{\\\"data\\\":{\\\"qualification\\\":[{\\\"categorycode\\\":\\\"2\\\",\\\"code\\\":\\\"广发2\\\",\\\"controled\\\":true,\\\"controledWt\\\":false,\\\"effectivedate\\\":\\\"2021-02-28\\\",\\\"expirydate\\\":\\\"2026-02-27\\\",\\\"isclosed\\\":0,\\\"maker\\\":\\\"yc_wkuiyz68249@027168.com\\\",\\\"name\\\":\\\"广发2\\\",\\\"supplierPK\\\":\\\"1001A1100000000016HJ\\\",\\\"vencode\\\":\\\"GY000040\\\",\\\"ycid\\\":\\\"9863\\\"}],\\\"orgId\\\":\\\"0\\\"}}\"}]}";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '\\') {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());

        HashMap map = new HashMap();
        map.put("123",123213);
        System.out.println(map);
    }
    public LRU缓存机制146(int capacity) {

    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {

    }
}
