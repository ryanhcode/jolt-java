// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$50 {

    static final FunctionDescriptor JPC_BodyInterface_CreateAndAddBody$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_CreateAndAddBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_CreateAndAddBody",
        constants$50.JPC_BodyInterface_CreateAndAddBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_IsAdded$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_IsAdded$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_IsAdded",
        constants$50.JPC_BodyInterface_IsAdded$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetLinearAndAngularVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetLinearAndAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetLinearAndAngularVelocity",
        constants$50.JPC_BodyInterface_SetLinearAndAngularVelocity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetLinearAndAngularVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetLinearAndAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetLinearAndAngularVelocity",
        constants$50.JPC_BodyInterface_GetLinearAndAngularVelocity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetLinearVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetLinearVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetLinearVelocity",
        constants$50.JPC_BodyInterface_SetLinearVelocity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetLinearVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetLinearVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetLinearVelocity",
        constants$50.JPC_BodyInterface_GetLinearVelocity$FUNC
    );
}


