// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$61 {

    static final FunctionDescriptor JPC_Body_GetInverseCenterOfMassTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetInverseCenterOfMassTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetInverseCenterOfMassTransform",
        constants$61.JPC_Body_GetInverseCenterOfMassTransform$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetWorldSpaceBounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetWorldSpaceBounds$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetWorldSpaceBounds",
        constants$61.JPC_Body_GetWorldSpaceBounds$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetMotionProperties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetMotionProperties$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetMotionProperties",
        constants$61.JPC_Body_GetMotionProperties$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetUserData",
        constants$61.JPC_Body_GetUserData$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetUserData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle JPC_Body_SetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetUserData",
        constants$61.JPC_Body_SetUserData$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetWorldSpaceSurfaceNormal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetWorldSpaceSurfaceNormal$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetWorldSpaceSurfaceNormal",
        constants$61.JPC_Body_GetWorldSpaceSurfaceNormal$FUNC
    );
}


