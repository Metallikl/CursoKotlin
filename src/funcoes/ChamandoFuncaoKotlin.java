package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args){
        ArrayList list = CollectionsKt.arrayListOf("João","Maria","Pedro");
        ArrayList list2 = CollectionsKt.arrayListOf(0,"1",2,3,"4",false);

        System.out.println(SegundoElementoListKt.secondOrNull(list));
        System.out.println(SegundoElementoListKt.secondOrNull(list2));
    }
}
