// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor JPC_ConvexShape_SetDensity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_ConvexShape_SetDensity$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShape_SetDensity",
        constants$48.JPC_ConvexShape_SetDensity$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShape_GetDensity$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShape_GetDensity$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShape_GetDensity",
        constants$48.JPC_ConvexShape_GetDensity$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_CreateBody$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_CreateBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_CreateBody",
        constants$48.JPC_BodyInterface_CreateBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_DestroyBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_DestroyBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_DestroyBody",
        constants$48.JPC_BodyInterface_DestroyBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBody",
        constants$48.JPC_BodyInterface_AddBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_RemoveBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_RemoveBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_RemoveBody",
        constants$48.JPC_BodyInterface_RemoveBody$FUNC
    );
}


