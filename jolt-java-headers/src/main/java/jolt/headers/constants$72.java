// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$72 {

    static final FunctionDescriptor JPC_BodyInterface_GetAngularVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetAngularVelocity",
        constants$72.JPC_BodyInterface_GetAngularVelocity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetPointVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetPointVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetPointVelocity",
        constants$72.JPC_BodyInterface_GetPointVelocity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetPositionRotationAndVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetPositionRotationAndVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetPositionRotationAndVelocity",
        constants$72.JPC_BodyInterface_SetPositionRotationAndVelocity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddForce$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddForce$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddForce",
        constants$72.JPC_BodyInterface_AddForce$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddForceAtPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddForceAtPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddForceAtPosition",
        constants$72.JPC_BodyInterface_AddForceAtPosition$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddTorque$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddTorque$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddTorque",
        constants$72.JPC_BodyInterface_AddTorque$FUNC
    );
}


