package sigar.examples;

import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 * @author saeed
 * @created 08/07/2022 - 3:37 p.m.
 * @project SigarJava
 */
public class CpuEx {
    public static void main(String[] args) throws SigarException {
        Sigar sigar = new Sigar();
        Mem mem = sigar.getMem();

        System.out.println("Get cpu idle: " + mem.getTotal());
    }
}
