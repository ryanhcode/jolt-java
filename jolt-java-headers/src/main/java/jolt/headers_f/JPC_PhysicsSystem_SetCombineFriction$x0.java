// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface JPC_PhysicsSystem_SetCombineFriction$x0 {

    float apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
    static MemorySegment allocate(JPC_PhysicsSystem_SetCombineFriction$x0 fi, MemorySession session) {
        return RuntimeHelper.upcallStub(JPC_PhysicsSystem_SetCombineFriction$x0.class, fi, constants$27.JPC_PhysicsSystem_SetCombineFriction$x0$FUNC, session);
    }
    static JPC_PhysicsSystem_SetCombineFriction$x0 ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
            try {
                return (float)constants$27.JPC_PhysicsSystem_SetCombineFriction$x0$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


