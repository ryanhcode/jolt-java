// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$79 {

    static final FunctionDescriptor JPC_Body_GetInverseInertia$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetInverseInertia$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetInverseInertia",
        constants$79.JPC_Body_GetInverseInertia$FUNC
    );
    static final FunctionDescriptor JPC_Body_AddImpulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_AddImpulse$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_AddImpulse",
        constants$79.JPC_Body_AddImpulse$FUNC
    );
    static final FunctionDescriptor JPC_Body_AddImpulseAtPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_AddImpulseAtPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_AddImpulseAtPosition",
        constants$79.JPC_Body_AddImpulseAtPosition$FUNC
    );
    static final FunctionDescriptor JPC_Body_AddAngularImpulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_AddAngularImpulse$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_AddAngularImpulse",
        constants$79.JPC_Body_AddAngularImpulse$FUNC
    );
    static final FunctionDescriptor JPC_Body_MoveKinematic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_Body_MoveKinematic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_MoveKinematic",
        constants$79.JPC_Body_MoveKinematic$FUNC
    );
    static final FunctionDescriptor JPC_Body_ApplyBuoyancyImpulse$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_Body_ApplyBuoyancyImpulse$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_ApplyBuoyancyImpulse",
        constants$79.JPC_Body_ApplyBuoyancyImpulse$FUNC
    );
}


