// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_ShapeResult {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("result"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_CHAR$LAYOUT).withName("error")
    ).withName("JPC_ShapeResult");
    public static MemoryLayout $LAYOUT() {
        return JPC_ShapeResult.$struct$LAYOUT;
    }
    static final VarHandle result$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("result"));
    public static VarHandle result$VH() {
        return JPC_ShapeResult.result$VH;
    }
    public static MemoryAddress result$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_ShapeResult.result$VH.get(seg);
    }
    public static void result$set( MemorySegment seg, MemoryAddress x) {
        JPC_ShapeResult.result$VH.set(seg, x);
    }
    public static MemoryAddress result$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_ShapeResult.result$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void result$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_ShapeResult.result$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment error$slice(MemorySegment seg) {
        return seg.asSlice(8, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


