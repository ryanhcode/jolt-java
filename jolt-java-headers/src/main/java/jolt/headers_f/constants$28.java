// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$28 {

    static final FunctionDescriptor JPC_MotionProperties_SetInverseInertia$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetInverseInertia$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetInverseInertia",
        constants$28.JPC_MotionProperties_SetInverseInertia$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetLocalSpaceInverseInertia$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetLocalSpaceInverseInertia$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetLocalSpaceInverseInertia",
        constants$28.JPC_MotionProperties_GetLocalSpaceInverseInertia$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetInverseInertiaForRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetInverseInertiaForRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetInverseInertiaForRotation",
        constants$28.JPC_MotionProperties_GetInverseInertiaForRotation$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector",
        constants$28.JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetPointVelocityCOM$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetPointVelocityCOM$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetPointVelocityCOM",
        constants$28.JPC_MotionProperties_GetPointVelocityCOM$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetAccumulatedForce$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetAccumulatedForce$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetAccumulatedForce",
        constants$28.JPC_MotionProperties_GetAccumulatedForce$FUNC
    );
}


