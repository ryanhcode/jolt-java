// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$29 {

    static final FunctionDescriptor JPC_PhysicsSystem_Update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_Update$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_Update",
        constants$29.JPC_PhysicsSystem_Update$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBodyLockInterface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBodyLockInterface$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBodyLockInterface",
        constants$29.JPC_PhysicsSystem_GetBodyLockInterface$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBodyLockInterfaceNoLock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBodyLockInterfaceNoLock$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBodyLockInterfaceNoLock",
        constants$29.JPC_PhysicsSystem_GetBodyLockInterfaceNoLock$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBroadPhaseQuery$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBroadPhaseQuery$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBroadPhaseQuery",
        constants$29.JPC_PhysicsSystem_GetBroadPhaseQuery$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetNarrowPhaseQuery$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetNarrowPhaseQuery$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetNarrowPhaseQuery",
        constants$29.JPC_PhysicsSystem_GetNarrowPhaseQuery$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetNarrowPhaseQueryNoLock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetNarrowPhaseQueryNoLock$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetNarrowPhaseQueryNoLock",
        constants$29.JPC_PhysicsSystem_GetNarrowPhaseQueryNoLock$FUNC
    );
}


