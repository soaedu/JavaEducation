package java_regular.data.type.arrays.operation.merge;

public class ArrMerger {
    public static int[] merge(int[] item1, int[] item2) {
        int[] result = new int[item1.length + item2.length];

        int item1Index = 0;
        int item2Index = 0;

        if(result.length > 1) {
            while(true) {
                if(item1Index != (item1.length-1)) {
                    if(item1[item1Index] < item2[item2Index]) {
                        result[item1Index + item2Index] = item1[item1Index++];
                        continue;
                    } else {
                        if(item2Index != (item2.length-1)) {
                            result[item1Index + item2Index] = item2[item2Index++];
                            continue;
                        } else {
                            result[item1Index + item2Index] = item2[item2Index];
                            System.arraycopy(item1, (item1Index), result, (item1Index + item2Index + 1),
                                    (item1.length - item1Index));
                            break;
                        }
                    }
                } else {
                    if(item1[item1Index] < item2[item2Index]) {
                        result[item1Index + item2Index] = item1[item1Index];
                        System.arraycopy(item2, (item2Index),result,(item2Index + item1Index + 1),
                                (item2.length - item2Index));
                        break;
                    } else {
                        result[item1Index + item2Index] = item2[item2Index];

                        if(item2Index != (item2.length-1)) {
                            item2Index++;
                            continue;
                        } else {
                            result[item1Index + item2Index + 1] = item1[item1Index];
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
