// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$76 {

    static final FunctionDescriptor JPC_BodyInterface_InvalidateContactCache$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_InvalidateContactCache$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_InvalidateContactCache",
        constants$76.JPC_BodyInterface_InvalidateContactCache$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetID$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetID$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetID",
        constants$76.JPC_Body_GetID$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsActive$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsActive$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsActive",
        constants$76.JPC_Body_IsActive$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsStatic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsStatic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsStatic",
        constants$76.JPC_Body_IsStatic$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsKinematic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsKinematic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsKinematic",
        constants$76.JPC_Body_IsKinematic$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsDynamic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsDynamic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsDynamic",
        constants$76.JPC_Body_IsDynamic$FUNC
    );
}


