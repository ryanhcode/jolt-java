// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$126 {

    static final FunctionDescriptor JPC_SliderConstraintSettings_GetDamping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraintSettings_GetDamping$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraintSettings_GetDamping",
        constants$126.JPC_SliderConstraintSettings_GetDamping$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraintSettings_SetDamping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraintSettings_SetDamping$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraintSettings_SetDamping",
        constants$126.JPC_SliderConstraintSettings_SetDamping$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraintSettings_GetMaxFrictionForce$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraintSettings_GetMaxFrictionForce$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraintSettings_GetMaxFrictionForce",
        constants$126.JPC_SliderConstraintSettings_GetMaxFrictionForce$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraintSettings_SetMaxFrictionForce$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraintSettings_SetMaxFrictionForce$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraintSettings_SetMaxFrictionForce",
        constants$126.JPC_SliderConstraintSettings_SetMaxFrictionForce$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraintSettings_GetMotorSettings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraintSettings_GetMotorSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraintSettings_GetMotorSettings",
        constants$126.JPC_SliderConstraintSettings_GetMotorSettings$FUNC
    );
    static final FunctionDescriptor JPC_SwingTwistConstraintSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle JPC_SwingTwistConstraintSettings_Create$MH = RuntimeHelper.downcallHandleVariadic(
        "JPC_SwingTwistConstraintSettings_Create",
        constants$126.JPC_SwingTwistConstraintSettings_Create$FUNC
    );
}


