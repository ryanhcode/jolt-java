// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$55 {

    static final FunctionDescriptor JPC_Body_GetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetPosition",
        constants$55.JPC_Body_GetPosition$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetRotation",
        constants$55.JPC_Body_GetRotation$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetWorldTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetWorldTransform",
        constants$55.JPC_Body_GetWorldTransform$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetCenterOfMassPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetCenterOfMassPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetCenterOfMassPosition",
        constants$55.JPC_Body_GetCenterOfMassPosition$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetCenterOfMassTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetCenterOfMassTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetCenterOfMassTransform",
        constants$55.JPC_Body_GetCenterOfMassTransform$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetInverseCenterOfMassTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetInverseCenterOfMassTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetInverseCenterOfMassTransform",
        constants$55.JPC_Body_GetInverseCenterOfMassTransform$FUNC
    );
}


