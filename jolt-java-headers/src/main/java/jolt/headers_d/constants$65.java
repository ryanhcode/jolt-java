// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor JPC_BodyInterface_GetShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetShape",
        constants$65.JPC_BodyInterface_GetShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetShape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetShape",
        constants$65.JPC_BodyInterface_SetShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_NotifyShapeChanged$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_NotifyShapeChanged$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_NotifyShapeChanged",
        constants$65.JPC_BodyInterface_NotifyShapeChanged$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetObjectLayer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetObjectLayer",
        constants$65.JPC_BodyInterface_SetObjectLayer$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetObjectLayer$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetObjectLayer",
        constants$65.JPC_BodyInterface_GetObjectLayer$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetPositionAndRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetPositionAndRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetPositionAndRotation",
        constants$65.JPC_BodyInterface_SetPositionAndRotation$FUNC
    );
}


