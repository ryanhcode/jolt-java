// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$119 {

    static final FunctionDescriptor JPC_HingeConstraintSettings_GetLimitsMax$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_GetLimitsMax$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_GetLimitsMax",
        constants$119.JPC_HingeConstraintSettings_GetLimitsMax$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_SetLimitsMax$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_SetLimitsMax$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_SetLimitsMax",
        constants$119.JPC_HingeConstraintSettings_SetLimitsMax$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_GetMaxFrictionTorque$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_GetMaxFrictionTorque$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_GetMaxFrictionTorque",
        constants$119.JPC_HingeConstraintSettings_GetMaxFrictionTorque$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_SetMaxFrictionTorque$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_SetMaxFrictionTorque$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_SetMaxFrictionTorque",
        constants$119.JPC_HingeConstraintSettings_SetMaxFrictionTorque$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_GetMotorSettings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_GetMotorSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_GetMotorSettings",
        constants$119.JPC_HingeConstraintSettings_GetMotorSettings$FUNC
    );
    static final FunctionDescriptor JPC_ConeConstraintSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle JPC_ConeConstraintSettings_Create$MH = RuntimeHelper.downcallHandleVariadic(
        "JPC_ConeConstraintSettings_Create",
        constants$119.JPC_ConeConstraintSettings_Create$FUNC
    );
}


